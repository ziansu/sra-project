@java.lang.Override
public com.mauriciotogneri.apivalidator.api.ApiResult validate(okhttp3.Response response, java.lang.String body) throws java.lang.Exception {
    java.lang.String result = body(response);
    com.github.fge.jsonschema.core.report.ProcessingReport report = validate(result, schema);
    if (report.isSuccess()) {
        return com.mauriciotogneri.apivalidator.api.ApiResult.valid(response, result);
    }else {
        return com.mauriciotogneri.apivalidator.api.ApiResult.error(response, result, report.toString());
    }
}