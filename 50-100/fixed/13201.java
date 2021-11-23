public void addData(byte b) {
    if ((1 + (m_end)) > (us.pfrommer.insteon.msg.MsgReader.MAX_MSG_LEN)) {
        us.pfrommer.insteon.msg.MsgReader.logger.error("warn: truncating excessively long message!");
    }else {
        m_buf[m_end] = b;
        m_end += 1;
        us.pfrommer.insteon.msg.MsgReader.logger.trace("read buffer: len {} data: {}", 1, us.pfrommer.insteon.utils.Utils.toHex(b));
    }
}