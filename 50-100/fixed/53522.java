public java.lang.String run() {
    java.lang.String result = "";
    try {
        result = getText(this.validateTwitterStr());
    } catch (org.manalith.ircbot.plugin.twitreader.exceptions.StrDoesntSpecifiedException e) {
        result = "문자열이 없습니다";
        return result;
    } catch (org.manalith.ircbot.plugin.twitreader.exceptions.UnknownTypeOfStringException ue) {
        result = "알 수 없는 형식의 문자열입니다";
    }
    return result;
}