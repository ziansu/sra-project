public void validate(org.zkoss.bind.ValidationContext ctx) {
    lt.insoft.training.model.PictureData pictureData = ((lt.insoft.training.model.PictureData) (ctx.getValidatorArg("upload")));
    java.lang.String message = ((java.lang.String) (ctx.getBindContext().getValidatorArg("message")));
    if ((pictureData == null) || ((pictureData.getData()) == null)) {
        this.addInvalidMessage(ctx, "pictureUpload", message);
    }
}