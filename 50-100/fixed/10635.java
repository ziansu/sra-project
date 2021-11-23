public int compareTo(main.hibernate.dao.RankingDao o) {
    if ((this.betScore) > (o.getBetScore()))
        return -1;
    
    if ((this.betScore) < (o.getBetScore()))
        return 1;
    
    return 0;
}