public double getWave(double hertz, double frame, Waves.WaveType type) {
    switch (type) {
        case sin :
            return sin(hertz, frame);
        case square :
            return square(hertz, frame);
        case saw :
            return saw(hertz, frame);
        case triangle :
            return triangle(hertz, frame);
        default :
            return sin(hertz, frame);
    }
}