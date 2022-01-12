private void addDefaultFilters() {
    globalfilters.add(new net.pixelstatic.pixtigen.generator.Filter(FilterType.shading));
    addFilter(Material.leaves, FilterType.noise);
    addFilter(Material.leaves, FilterType.shadows);
    addFilter(Material.leaves, FilterType.outline);
    addFilter(Material.leaves, FilterType.needles);
    addFilter(Material.leaves, FilterType.light);
    addFilter(Material.leaves, FilterType.lines);
    addFilter(Material.leaves, FilterType.round);
    addFilter(Material.leaves, FilterType.crystallize);
    addFilter(Material.wood, FilterType.outline);
    addFilter(Material.wood, FilterType.shadows);
    addFilter(Material.wood, FilterType.bark);
}