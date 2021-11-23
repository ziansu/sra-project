protected final org.voltdb.iv2.TxnEgo advanceTxnEgo() {
    m_txnEgo = m_txnEgo.makeNext();
    return m_txnEgo;
}