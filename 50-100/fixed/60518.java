public void updateUI(final java.util.List<msi.gama.runtime.exceptions.GamaRuntimeException> newExceptions) {
    if (newExceptions != null) {
        for (final msi.gama.runtime.exceptions.GamaRuntimeException exception : new java.util.ArrayList<msi.gama.runtime.exceptions.GamaRuntimeException>(newExceptions)) {
            if (exception.isInvalid()) {
                newExceptions.remove(exception);
            }
        }
        cleanExceptions = newExceptions;
    }
    msi.gama.runtime.GAMA.getGui().displayErrors(newExceptions);
}