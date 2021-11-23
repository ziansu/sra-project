@java.lang.Override
public com.whatsthatlight.teamcity.hipchat.HipChatEmoticons getEmoticons(int startIndex) {
    if ((this.emoticonsResult) == null) {
        return super.getEmoticons(startIndex);
    }else {
        com.whatsthatlight.teamcity.hipchat.HipChatEmoticons result = this.emoticonsResult;
        this.emoticonsResult = null;
        return result;
    }
}