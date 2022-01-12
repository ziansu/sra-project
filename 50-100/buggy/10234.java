@java.lang.Override
public java.lang.Boolean call(com.appunite.rx.example.model.model.AddPost addPost) {
    final boolean nameIsPresent = !(com.google.common.base.Strings.isNullOrEmpty(addPost.name()));
    final boolean bodyIsPresent = !(com.google.common.base.Strings.isNullOrEmpty(addPost.body()));
    return nameIsPresent || bodyIsPresent;
}