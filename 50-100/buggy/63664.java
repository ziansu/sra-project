void promoteMediumToHighOnWait() {
    if ((this.mediumTick) == (this.MED_WAIT)) {
        this._promote(this.medium, this.high);
        this.mediumTick = 1;
    }else {
        (this.mediumTick)++;
    }
}