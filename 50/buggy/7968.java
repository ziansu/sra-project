public int compareTo(structures._QUPair qu) {
    if ((this.m_score) > (qu.m_score))
        return 1;
    else
        if ((this.m_score) < (qu.m_score))
            return -1;
        else
            return 0;
        
    
}