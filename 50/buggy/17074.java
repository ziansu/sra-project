public boolean isFull() {
    return (((m_posBack) + 2) % (de.hhu.bsinfo.dxnet.core.MessageCreator.SIZE)) == ((m_posFront) % (de.hhu.bsinfo.dxnet.core.MessageCreator.SIZE));
}