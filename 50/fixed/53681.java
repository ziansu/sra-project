private void commentLine() {
    while ((!(isEndOfFile())) && (!(isEndline()))) {
        next();
    } 
    endline();
}