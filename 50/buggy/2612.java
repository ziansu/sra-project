@java.lang.Override
public java.lang.String getValue(in.cybergen.ml.models.Post post) {
    return com.sun.deploy.util.StringUtils.join(post.getTags(), ",");
}