public static com.uber.tchannel.messages.Response build(com.uber.tchannel.headers.ArgScheme argScheme, com.uber.tchannel.messages.ErrorResponse errorResponse) {
    com.uber.tchannel.messages.Response res;
    switch (argScheme) {
        case RAW :
            res = new com.uber.tchannel.messages.RawResponse(errorResponse);
            break;
        case JSON :
            res = new com.uber.tchannel.messages.JsonResponse(errorResponse);
            break;
        case THRIFT :
            res = new com.uber.tchannel.messages.ThriftResponse(errorResponse);
            break;
        default :
            res = null;
            break;
    }
    return res;
}