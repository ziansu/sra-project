public Field.control isVictoryAchievied() {
    if ((this.isHorizontalMatch()) != (Field.control.NONE))
        return this.isHorizontalMatch();
    
    if ((this.isVerticalMatch()) != (Field.control.NONE))
        return this.isVerticalMatch();
    
    return Field.control.NONE;
}