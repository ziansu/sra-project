public static java.lang.String toString(org.wordpress.android.fluxc.model.post.PostStatus status) {
    switch (status) {
        case PUBLISHED :
            return "publish";
        case DRAFT :
            return "draft";
        case PRIVATE :
            return "private";
        case PENDING :
            return "pending";
        case TRASHED :
            return "trash";
        case SCHEDULED :
            return "future";
        default :
            return "";
    }
}