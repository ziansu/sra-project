public void addData(byte[] data, int off, int len) {
    if ((len + (m_end)) > (us.pfrommer.insteon.msg.MsgReader.MAX_MSG_LEN)) {
        us.pfrommer.insteon.msg.MsgReader.logger.error("warn: truncating excessively long message!");
        len = (us.pfrommer.insteon.msg.MsgReader.MAX_MSG_LEN) - (m_end);
    }
    java.lang.System.arraycopy(data, off, m_buf, m_end, len);
    m_end += len;
    us.pfrommer.insteon.msg.MsgReader.logger.trace("read buffer: len {} data: {}", m_end, us.pfrommer.insteon.utils.Utils.toHex(m_buf, m_end));
}