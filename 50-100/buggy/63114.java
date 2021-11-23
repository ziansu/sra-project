void build(processing.core.PApplet p, ControlP5 cp5) {
    this.p = p;
    this.cp5 = cp5;
    this.begin.build(p, cp5);
    this.end.build(p, cp5);
    for (State s : states)
        s.build(p, cp5);
    
    init_global_variables();
}