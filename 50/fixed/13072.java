static sample.Config.TileDesign forValue(int i) {
    if (i < (sample.Config.TileDesign.tileDesigns.length))
        return sample.Config.TileDesign.tileDesigns[i];
    else
        return sample.Config.TileDesign.unknown;
    
}