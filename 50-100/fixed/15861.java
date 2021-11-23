void add(org.apache.poi.hwpf.model.LFO lfo, org.apache.poi.hwpf.model.LFOData lfoData) {
    _rgLfo = java.util.Arrays.copyOf(_rgLfo, ((_lfoMac) + 1));
    _rgLfo[_lfoMac] = lfo;
    _rgLfoData = java.util.Arrays.copyOf(_rgLfoData, ((_lfoMac) + 1));
    _rgLfoData[_lfoMac] = lfoData;
    _lfoMac = (_lfoMac) + 1;
}