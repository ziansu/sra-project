public int useNextID() {
    while (true) {
        for (int no = nextID; no < (Server.ServerEngine.NUMBER_OF_IDS); no++) {
            if ((usedIDs[no]) != true) {
                usedIDs[no] = true;
                nextID = no++;
                return no;
            }
        }
        nextID = 0;
    } 
}