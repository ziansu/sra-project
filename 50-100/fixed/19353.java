@java.lang.Override
public com.mauriciotogneri.apivalidator.api.ApiResult validate(okhttp3.Response response, java.lang.String body) throws java.lang.Exception {
    com.github.fge.jsonschema.core.report.ProcessingReport report = validate(body, schema);
    if (report.isSuccess()) {
        return com.mauriciotogneri.apivalidator.api.ApiResult.valid(response, body);
    }else {
        return com.mauriciotogneri.apivalidator.api.ApiResult.error(response, body, report.toString());
    }
}