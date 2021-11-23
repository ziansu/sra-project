public void setOnMe(main.MovingObject OnMe) {
    if ((OnMe != null) && ((this.OnMe) != null))
        OnMe.crash();
    
    this.OnMe = OnMe;
    if ((station) != null)
        OnMe.ArrivedAtStation(station);
    
}