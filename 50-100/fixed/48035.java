@java.lang.Override
public com.cmy.xcheck.support.XResult validate(com.cmy.xcheck.util.validate.ValidateParam validateParam) {
    java.util.regex.Pattern checkPattern = java.util.regex.Pattern.compile(validateParam.getArgumentsVal());
    java.util.regex.Matcher matcher = checkPattern.matcher(validateParam.getMainFieldVal());
    if (matcher.matches()) {
        return com.cmy.xcheck.support.XResult.success();
    }
    return com.cmy.xcheck.support.XResult.failure(((getFieldAlias(validateParam)) + "参数不正确"));
}