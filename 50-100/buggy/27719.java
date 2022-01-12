private static java.lang.String[] getTemporaryFileListFromHiddenForm() {
    play.mvc.Http.MultipartFormData body = request().body().asMultipartFormData();
    if (body == null) {
        return new java.lang.String[]{  };
    }
    java.lang.String[] temporaryUploadFiles = body.asFormUrlEncoded().get(AttachmentApp.TAG_NAME_FOR_TEMPORARY_UPLOAD_FILES);
    if (temporaryUploadFiles == null) {
        return new java.lang.String[]{  };
    }
    final java.lang.String CSV_DELIMITER = ",";
    return temporaryUploadFiles[0].split(CSV_DELIMITER);
}