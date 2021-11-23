@java.lang.Override
public boolean isStoryType() {
    switch (getType()) {
        case STORY_TYPE :
        case POLL_TYPE :
        case JOB_TYPE :
            return true;
        case COMMENT_TYPE :
        default :
            return false;
    }
}