void add(org.apache.poi.hwpf.model.LFO lfo, org.apache.poi.hwpf.model.LFOData lfoData) {
    final int newLfoMac = (_lfoMac) + 1;
    _rgLfo = java.util.Arrays.copyOf(_rgLfo, newLfoMac);
    _rgLfo[((_lfoMac) + 1)] = lfo;
    _rgLfoData = java.util.Arrays.copyOf(_rgLfoData, newLfoMac);
    _rgLfoData[((_lfoMac) + 1)] = lfoData;
    this._lfoMac = newLfoMac;
}