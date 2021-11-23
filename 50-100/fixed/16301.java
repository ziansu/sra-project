@com.pratilipi.api.annotation.Get
public com.pratilipi.api.impl.pratilipi.shared.GetPratilipiContentResponse getPratilipiContent(com.pratilipi.api.impl.pratilipi.shared.GetPratilipiContentRequest request) throws com.pratilipi.common.exception.InsufficientAccessException, com.pratilipi.common.exception.InvalidArgumentException, com.pratilipi.common.exception.UnexpectedServerException {
    java.lang.Object content = com.pratilipi.data.util.PratilipiDataUtil.getPratilipiContent(request.getPratilipiId(), request.getChapterNo(), request.getPageNo(), PratilipiContentType.PRATILIPI);
    return new com.pratilipi.api.impl.pratilipi.shared.GetPratilipiContentResponse(request.getPratilipiId(), request.getPageNo(), content);
}