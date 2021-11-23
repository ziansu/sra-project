@java.lang.Override
public void msgWritten(us.pfrommer.insteon.msg.Msg msg) {
    byte[] bytes = msg.getData();
    m_area.append((("OUT: " + (us.pfrommer.insteon.utils.Utils.toHex(bytes, bytes.length, " "))) + "\n"));
    m_area.setCaretPosition(m_area.getDocument().getLength());
}