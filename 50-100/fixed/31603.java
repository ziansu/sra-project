public static void main(java.lang.String[] args) {
    java.lang.System.out.println("As I was going to St. Ives");
    java.lang.System.out.println("I met a man with seven wives");
    java.lang.System.out.println("Each wife had seven sacks");
    java.lang.System.out.println("Each sack had seven cats");
    java.lang.System.out.println("Each cat had seven kits");
    java.lang.System.out.println("Kittens, cats, sacks, wives");
    java.lang.System.out.println("How many were going to St. Ives?");
    boolean manGoingToStIves = true;
    int numWives = 7;
    int numSacksPerWife = 7;
    int numCatsPerSack = 7;
    int numKitsPerCat = 7;
    int total;
    if (manGoingToStIves) {
        total = 1 + (numWives++);
    }else {
        total = 1;
    }
}