public java.lang.String EscCommand() {
    java.lang.String esccmd = java.lang.String.format("{\"a\":%d,\"b\":%d,\"c\":%d,\"d\":%d}", this.motorA.Speed(), this.motorB.Speed(), this.motorC.Speed(), this.motorD.Speed());
    return esccmd;
}