public int compareTo(uk.chromis.pos.ticket.CouponLine o) {
    int c = o.m_Id.compareTo(m_Id);
    if (c == 0) {
        c = (m_LineNumber) - (o.m_LineNumber);
    }
    return c;
}