public Plateau.Plateau.Color getColor(java.lang.String s) {
    Plateau.Plateau.Color color = null;
    java.lang.System.out.println(s);
    switch (s) {
        case "R" :
            color = Plateau.Plateau.Color.R;
            break;
        case "B" :
            color = Plateau.Plateau.Color.B;
            break;
        case "J" :
            color = Plateau.Plateau.Color.J;
            break;
        case "V" :
            color = Plateau.Plateau.Color.V;
            break;
    }
    return color;
}