public static void deleteAttachmentFiles(android.app.Activity activity, java.util.List<ve.com.abicelis.remindy.model.attachment.Attachment> attachments) {
    for (ve.com.abicelis.remindy.model.attachment.Attachment attachment : attachments) {
        switch (attachment.getType()) {
            case AUDIO :
                java.lang.String audioFilename = ((ve.com.abicelis.remindy.model.attachment.AudioAttachment) (attachment)).getAudioFilename();
                ve.com.abicelis.remindy.util.FileUtil.deleteAudioAttachment(activity, audioFilename);
                break;
            case IMAGE :
                java.lang.String imageFilename = ((ve.com.abicelis.remindy.model.attachment.ImageAttachment) (attachment)).getImageFilename();
                ve.com.abicelis.remindy.util.FileUtil.deleteImageAttachment(activity, imageFilename);
                break;
        }
    }
}