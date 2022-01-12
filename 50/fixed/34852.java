@java.lang.Override
public boolean isStoryType() {
    switch (getType()) {
        case COMMENT_TYPE :
            return false;
        default :
            return true;
    }
}