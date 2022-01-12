@org.protocoderrunner.apidoc.annotation.ProtoMethod(description = "Creates a new image view", example = "")
@org.protocoderrunner.apidoc.annotation.ProtoMethodParam(params = { "imageName" })
public org.protocoderrunner.apprunner.api.widgets.PImageView newImage(java.lang.String imagePath) {
    initializeLayout();
    final org.protocoderrunner.apprunner.api.widgets.PImageView iv = new org.protocoderrunner.apprunner.api.widgets.PImageView(getActivity());
    if (imagePath != null) {
        iv.setImage(imagePath);
    }
    return iv;
}