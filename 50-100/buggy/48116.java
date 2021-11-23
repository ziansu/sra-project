public fakescript.funcunion clonef() {
    fakescript.funcunion fc = new fakescript.funcunion();
    fc.m_ff = this.m_ff;
    fc.m_bif = this.m_bif;
    fc.m_fb = this.m_fb.clonef();
    fc.m_haveff = this.m_haveff;
    fc.m_havebif = this.m_havebif;
    fc.m_havefb = this.m_havefb;
    return fc;
}