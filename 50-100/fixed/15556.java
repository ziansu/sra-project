public int[] mainCharacterInfo() {
    int[] character = new int[3];
    int self_no = client.character();
    int index = info.clientNumberList.indexOf(self_no);
    if (info.CD) {
        character[0] = 1;
    }else {
        character[0] = 0;
    }
    character[1] = info.dirList.get(index);
    character[2] = self_no;
    return character;
}