@java.lang.Override
public double apply(double... args) {
    if ((java.lang.Math.abs((3.0 - (args[this.argIdx[0]])))) < 0.01)
        return 1.0;
    else
        return -1.0;
    
}