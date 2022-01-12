public synchronized int useNextID() {
    while (true) {
        for (int no = nextID; no < (Server.ServerEngine.NUMBER_OF_IDS); no++) {
            if ((usedIDs[no]) != true) {
                usedIDs[no] = true;
                nextID = no + 1;
                return no;
            }
        }
        nextID = 0;
    } 
}