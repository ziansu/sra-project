@java.lang.Override
public void push(double x) {
    (m_n)++;
    if ((m_n) == 1) {
        m_oldM = x;
        m_oldS = 0.0;
    }else {
        m_newM = (m_oldM) + ((x - (m_oldM)) / (m_n));
        m_newS = (m_oldS) + ((x - (m_oldM)) * (x - (m_newM)));
        m_oldM = m_newM;
        m_oldS = m_newS;
    }
}