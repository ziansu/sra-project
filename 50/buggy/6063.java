public static java.lang.String autoFlag(in.bhargavrao.stackoverflow.natty.entities.Post post) {
    in.bhargavrao.stackoverflow.natty.entities.AutoComment comment = new in.bhargavrao.stackoverflow.natty.entities.AutoComment(in.bhargavrao.stackoverflow.natty.entities.AutoCommentType.UNDEFINED);
    return in.bhargavrao.stackoverflow.natty.utils.PostUtils.autoFlag(post, comment);
}