@java.lang.Override
public java.lang.String toString() {
    return java.lang.String.join("\n", this.ueberschrift, this.unterueberschrift, ("AKZ: " + (this.aktenzeichen)), ("Datum: " + (this.datum)), ("Rechtsbereich: " + (this.rechtsbereich)), ("Vergehen: " + (this.vergehen)), ("Strafmass: " + (this.strafmass)), ("Gruende: " + (this.gruende)));
}