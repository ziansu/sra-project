public java.lang.String toString() {
    switch (this) {
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