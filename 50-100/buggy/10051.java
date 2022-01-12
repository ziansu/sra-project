public void addExp(int addedExp) {
    m_exp += addedExp;
    while ((m_exp) > (100 * (this.getLevel()))) {
        levelUp(((m_exp) - (100 * (this.getLevel()))));
    } 
}