public static boolean fullImage(me.ccrama.redditslide.ContentType.Type t) {
    switch (t) {
        case ALBUM :
        case DEVIANTART :
        case GIF :
        case IMAGE :
        case IMGUR :
        case STREAMABLE :
        case VIDEO :
        case SELF :
        case VID_ME :
            return true;
        case EMBEDDED :
        case EXTERNAL :
        case LINK :
        case NONE :
        case REDDIT :
        case SPOILER :
        default :
            return false;
    }
}