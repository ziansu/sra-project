@java.lang.Override
public void typeChar(char character, org.sikuli.vnc.KeyMode mode) {
    if ((character >= '\ue000') && (character < '\ue050')) {
        typeKey(org.sikuli.vnc.Key.toJavaKeyCode(character)[0], mode);
    }else {
        typeCode(charToXlib(character), mode);
    }
}