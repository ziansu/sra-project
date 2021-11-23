@java.lang.Override
protected void postProcess(final boolean success) {
    if (((husToReturn) != null) && (!(husToReturn.isEmpty()))) {
        getView().removeHUsAndInvalidate(husToReturn);
    }
}