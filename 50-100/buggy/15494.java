public double getWave(double hertz, double frame, double bendRate, Waves.WaveType type) {
    switch (type) {
        case sin :
            return sin(hertz, frame, bendRate);
        case square :
            return square(hertz, frame);
        case saw :
            return saw(hertz, frame);
        case triangle :
            return triangle(hertz, frame);
        default :
            return sin(hertz, frame, bendRate);
    }
}