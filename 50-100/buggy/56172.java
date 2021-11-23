@java.lang.Override
public model.character next() {
    if (this.hasNext()) {
        (currentIndex)++;
        java.lang.System.out.println(this.characterList.get(currentIndex).getName());
        return this.characterList.get(currentIndex);
    }else {
        currentIndex = 0;
        java.lang.System.out.println("New Round!");
        java.util.Collections.shuffle(this.characterList);
        return this.characterList.get(currentIndex);
    }
}