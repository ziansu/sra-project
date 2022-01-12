private org.eclipse.core.runtime.IStatus createStatusForError(java.lang.String message) {
    return validationErrorAsInfo ? org.eclipse.core.databinding.validation.ValidationStatus.info(message) : org.eclipse.core.databinding.validation.ValidationStatus.error(message);
}