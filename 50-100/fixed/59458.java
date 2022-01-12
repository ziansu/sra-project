@java.lang.Override
public java.lang.String getOption(final java.lang.String domain, final java.lang.String option, final com.dmdirc.util.validators.Validator<java.lang.String> validator) {
    final java.lang.String result = super.getOption(domain, option, validator);
    if ((result == null) || (!(result.contains("$theme")))) {
        return result;
    }else {
        return result.replace("$theme", theme.getFileName(false));
    }
}