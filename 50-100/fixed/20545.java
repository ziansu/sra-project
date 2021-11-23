public void koRundenLaden() {
    if (!(hasKOStage))
        return ;
    
    koRundenDatenFromFile = ausDatei(dateiKORundenDaten);
    this.numberOfKORounds = koRundenDatenFromFile.size();
    koRunden = new model.KORunde[numberOfKORounds];
    for (int i = 0; i < (koRunden.length); i++)
        koRunden[i] = new model.KORunde(start, this, i, false, koRundenDatenFromFile.get(i));
    
}