@java.lang.Override
public int compare(at.bitandart.zoubek.mervin.comments.MervinCommentGroup o1, at.bitandart.zoubek.mervin.comments.MervinCommentGroup o2) {
    return ((int) ((oldestComments.get(o1)) - (oldestComments.get(o2))));
}