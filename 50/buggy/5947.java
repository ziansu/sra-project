public int getAction(gr.PacManAI.GameState gs) {
    int direction = gs.closestPillDir();
    java.lang.System.out.println("Action choosen");
    return direction;
}